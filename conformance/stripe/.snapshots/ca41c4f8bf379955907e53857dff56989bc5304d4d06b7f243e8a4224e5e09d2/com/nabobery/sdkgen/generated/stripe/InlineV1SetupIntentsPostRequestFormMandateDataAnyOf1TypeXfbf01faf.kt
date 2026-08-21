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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0/properties/customer_acceptance/properties/type
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf) {
      encoder.encodeString(value.value)
    }
  }
}
