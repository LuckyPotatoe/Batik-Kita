# Machine Learning Batik Classifier

## Initial training results

### Vanilla Model
```
IMAGE_SHAPE = [150, 150]
BATCH_SIZE = 64

154/154 [==============================] - 62s 404ms/step - loss: 2.8602 - accuracy: 0.1233 - val_loss: 2.8834 - val_accuracy: 0.1311

IMAGE_SHAPE = [150, 150]
BATCH_SIZE = 64

model = tf.keras.models.Sequential([
    tf.keras.layers.Conv2D(64, (3, 3), activation='relu', input_shape=(IMAGE_SHAPE + [3])),
    tf.keras.layers.MaxPool2D(2, 2),
    tf.keras.layers.Conv2D(64, (3, 3), activation='relu'),
    tf.keras.layers.MaxPool2D(2, 2),
    tf.keras.layers.Flatten(),
    tf.keras.layers.Dense(256, activation = 'relu'),
    #20 Batik class, might add more later?
    tf.keras.layers.Dense(20, activation = 'softmax')
])
```
### PreTrained
```
IMAGE_SHAPE = [150, 150]
BATCH_SIZE = 256
```

| Model | Results | Param | Graph |
| ----- | ------- | ----- | ---- |
| Vanilla | 0.1695 | 21 M | ![Vanilla](https://i.imgur.com/wU68sUo.png "Vanilla") |
| EfficientNetB0 | 0.0616 | 5.3 M | ![EfficientNetB0](https://i.imgur.com/SufIBPg.png "Vanilla") |
| MobineNetV3 | 0.0833 | 4.2 M | ![MobineNetV3](https://i.imgur.com/Ey1R0Sm.png "MobineNetV3") |
| MobineNetV3 - No weight | 0.0665 | 4.2 M | ![MobineNetV3 - No weight](https://i.imgur.com/Mf4TcId.png "MobineNetV3 - No weight") |
| NASNetMobile | 0.0912 | 4.2 M | ![NASNetMobile](https://i.imgur.com/1ahcaaI.png "NASNetMobile") |

## Data Informati0n
20 Class Dataset
- 1000 Images From Indonesian Batik Motifs by Dionisius Darryl Hermansyah @Kaggle
- ~16k Images scrapped from Bing, cleaned to 10K
Total ~11K images

##### Based on [Indonesian Batik Motifs by Dionisius Darryl Hermansyah @Kaggle](https://www.kaggle.com/dionisiusdh/indonesian-batik-motifs)

