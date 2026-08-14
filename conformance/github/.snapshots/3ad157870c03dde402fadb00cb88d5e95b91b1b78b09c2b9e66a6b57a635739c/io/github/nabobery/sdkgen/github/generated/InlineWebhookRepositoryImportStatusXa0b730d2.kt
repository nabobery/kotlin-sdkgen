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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-import/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-import/properties/status
 */
@Serializable(with = InlineWebhookRepositoryImportStatusXa0b730d2.Serializer::class)
public sealed class InlineWebhookRepositoryImportStatusXa0b730d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookRepositoryImportStatusXa0b730d2() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookRepositoryImportStatusXa0b730d2() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookRepositoryImportStatusXa0b730d2() {
    public override val `value`: String = "failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryImportStatusXa0b730d2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryImportStatusXa0b730d2 = when (value) {
      Success.value -> Success
      Cancelled.value -> Cancelled
      Failure.value -> Failure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryImportStatusXa0b730d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRepositoryImportStatusXa0b730d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryImportStatusXa0b730d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryImportStatusXa0b730d2) {
      encoder.encodeString(value.value)
    }
  }
}
