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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations~1{calculation}~1line_items/get/responses/200/content/appl
 * ication~1json/schema/properties/object
 */
@Serializable(with = InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc.Serializer::class)
public sealed class InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsLineItemsGetResponse200JsonObjectValueX746a89cc) {
      encoder.encodeString(value.value)
    }
  }
}
