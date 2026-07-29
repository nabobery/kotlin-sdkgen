package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates if the person or any of their representatives, family members, or other closely related persons, declares
 * that they hold or have held an important public job or function, in any jurisdiction.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/political_exposure
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing`.
   */
  public data object Existing : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856() {
    public override val `value`: String = "existing"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856 = when (value) {
      Existing.value -> Existing
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormPoliticalExposureX08215856) {
      encoder.encodeString(value.value)
    }
  }
}
