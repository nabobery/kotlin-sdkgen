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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines/get/responses/200/content/application~1json/sche
 * ma/properties/object
 */
@Serializable(with = InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28.Serializer::class)
public sealed class InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesGetResponse200JsonObjectValueX02006a28) {
      encoder.encodeString(value.value)
    }
  }
}
