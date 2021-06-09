# Machine Learning Batik Classifier by Berenam Team

## Data Information
> Using dataset by Indonesian Batik Motif by Dionisius Darryl Hermansyah @Kaggle as a basis of work

> ~16k Images scrapped from Bing, cleaned to 10k for 20 class

Contain 2792 images for 13 batik class:
- Batik Besurek
- Batik Betawi
- Batik Cendrawasih
- Batik Ceplok
- Batik Dayak
- Batik Lasem
- Batik Megamendung
- Batik Parang
- Batik Sekar
- Batik Sidoluhur
- Batik Sidomukti
- Batik Tambal
- Batik Toraja

## Model
```
IMAGE_SHAPE = [200, 200]
BATCH_SIZE = 32

xception_model = tf.keras.applications.Xception(
    include_top=False,
    input_shape=IMAGE_SHAPE + [3]
)

for layer in xception_model.layers:
    layer.trainable = False

global_average_layer = tf.keras.layers.GlobalAveragePooling2D()
output_layer = tf.keras.layers.Dense(13, activation='softmax')

model = tf.keras.Sequential([
    xception_model,
    tf.keras.layers.Dropout(0.5),
    global_average_layer,
    tf.keras.layers.Dense(64),
    tf.keras.layers.Dropout(0.2),
    output_layer
])
```

## Result

```
lr = 0.0009992444531523302
loss: 0.6259
accuracy: 0.7904
val_loss: 1.1749
val_accuracy: 0.6410
```

![Xception](https://i.imgur.com/PMnmyhr.png "Xception")

## Reference Link
##### Based on [Indonesian Batik Motifs by Dionisius Darryl Hermansyah @Kaggle](https://www.kaggle.com/dionisiusdh/indonesian-batik-motifs)

