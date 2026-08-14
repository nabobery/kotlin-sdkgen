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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}~1computed_upfront_line_items/get/responses/200/content/appl
 * ication~1json/schema/properties/object
 */
@Serializable(with = InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5.Serializer::class)
public sealed class InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesComputedUpfrontLineItemsGetResponse200JsonObjectValueX0404f7b5) {
      encoder.encodeString(value.value)
    }
  }
}
