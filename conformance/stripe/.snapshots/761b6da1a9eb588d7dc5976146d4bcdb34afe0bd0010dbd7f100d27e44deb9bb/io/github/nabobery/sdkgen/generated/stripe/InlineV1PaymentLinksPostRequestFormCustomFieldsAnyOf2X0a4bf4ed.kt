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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_fields/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomFieldsAnyOf2X0a4bf4ed) {
      encoder.encodeString(value.value)
    }
  }
}
