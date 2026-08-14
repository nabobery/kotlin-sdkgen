package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/excluded_payment_method_types/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/excluded_payment_method_types/anyOf/1
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd) {
      encoder.encodeString(value.value)
    }
  }
}
