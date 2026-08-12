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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/defaults/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/defaults/properties/tax_behavior
 */
@Serializable(with = InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4.Serializer::class)
public sealed class InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `inferred_by_currency`.
   */
  public data object InferredByCurrency : InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4() {
    public override val `value`: String = "inferred_by_currency"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      InferredByCurrency.value -> InferredByCurrency
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4) {
      encoder.encodeString(value.value)
    }
  }
}
