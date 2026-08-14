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
 * orm-urlencoded/schema/properties/inactive_message/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/inactive_message/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729) {
      encoder.encodeString(value.value)
    }
  }
}
