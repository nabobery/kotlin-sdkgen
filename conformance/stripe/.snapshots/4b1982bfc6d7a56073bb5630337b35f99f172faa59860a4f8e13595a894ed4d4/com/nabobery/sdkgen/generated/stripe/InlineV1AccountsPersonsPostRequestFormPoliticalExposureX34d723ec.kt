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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/political_exposure
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing`.
   */
  public data object Existing : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec() {
    public override val `value`: String = "existing"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec = when (value) {
      Existing.value -> Existing
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormPoliticalExposureX34d723ec) {
      encoder.encodeString(value.value)
    }
  }
}
