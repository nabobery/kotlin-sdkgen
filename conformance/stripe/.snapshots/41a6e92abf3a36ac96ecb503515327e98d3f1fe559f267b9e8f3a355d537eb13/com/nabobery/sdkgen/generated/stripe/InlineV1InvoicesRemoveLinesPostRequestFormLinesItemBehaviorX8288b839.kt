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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/behavior
 */
@Serializable(with = InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839.Serializer::class)
public sealed class InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839() {
    public override val `value`: String = "delete"
  }

  /**
   * Documented value. Wire value: `unassign`.
   */
  public data object Unassign : InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839() {
    public override val `value`: String = "unassign"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839 = when (value) {
      Delete.value -> Delete
      Unassign.value -> Unassign
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839) {
      encoder.encodeString(value.value)
    }
  }
}
