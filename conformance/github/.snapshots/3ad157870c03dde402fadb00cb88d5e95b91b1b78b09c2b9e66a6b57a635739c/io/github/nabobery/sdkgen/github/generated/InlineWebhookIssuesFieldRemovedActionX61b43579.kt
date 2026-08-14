package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/action
 */
@Serializable(with = InlineWebhookIssuesFieldRemovedActionX61b43579.Serializer::class)
public sealed class InlineWebhookIssuesFieldRemovedActionX61b43579 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `field_removed`.
   */
  public data object FieldRemoved : InlineWebhookIssuesFieldRemovedActionX61b43579() {
    public override val `value`: String = "field_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesFieldRemovedActionX61b43579()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesFieldRemovedActionX61b43579 = when (value) {
      FieldRemoved.value -> FieldRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldRemovedActionX61b43579> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesFieldRemovedActionX61b43579", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldRemovedActionX61b43579 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldRemovedActionX61b43579) {
      encoder.encodeString(value.value)
    }
  }
}
