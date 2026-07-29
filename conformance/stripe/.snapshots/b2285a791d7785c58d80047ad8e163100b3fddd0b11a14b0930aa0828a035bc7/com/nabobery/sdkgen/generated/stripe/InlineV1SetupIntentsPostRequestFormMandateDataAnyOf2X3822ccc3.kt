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
 * chema/properties/mandate_data/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/1
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3) {
      encoder.encodeString(value.value)
    }
  }
}
