package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/action
 */
@Serializable(with = InlineWebhookRepositoryTransferredActionX374b5ad1.Serializer::class)
public sealed class InlineWebhookRepositoryTransferredActionX374b5ad1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `transferred`.
   */
  public data object Transferred : InlineWebhookRepositoryTransferredActionX374b5ad1() {
    public override val `value`: String = "transferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryTransferredActionX374b5ad1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryTransferredActionX374b5ad1 = when (value) {
      Transferred.value -> Transferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryTransferredActionX374b5ad1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryTransferredActionX374b5ad1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredActionX374b5ad1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredActionX374b5ad1) {
      encoder.encodeString(value.value)
    }
  }
}
