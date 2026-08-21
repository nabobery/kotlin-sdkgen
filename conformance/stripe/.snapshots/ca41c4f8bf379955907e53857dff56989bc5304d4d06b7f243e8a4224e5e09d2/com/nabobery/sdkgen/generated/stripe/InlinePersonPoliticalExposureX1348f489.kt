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
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/political_exposure
 */
@Serializable(with = InlinePersonPoliticalExposureX1348f489.Serializer::class)
public sealed class InlinePersonPoliticalExposureX1348f489 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing`.
   */
  public data object Existing : InlinePersonPoliticalExposureX1348f489() {
    public override val `value`: String = "existing"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePersonPoliticalExposureX1348f489() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePersonPoliticalExposureX1348f489()

  public companion object {
    public fun fromValue(`value`: String): InlinePersonPoliticalExposureX1348f489 = when (value) {
      Existing.value -> Existing
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePersonPoliticalExposureX1348f489> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePersonPoliticalExposureX1348f489", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePersonPoliticalExposureX1348f489 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePersonPoliticalExposureX1348f489) {
      encoder.encodeString(value.value)
    }
  }
}
