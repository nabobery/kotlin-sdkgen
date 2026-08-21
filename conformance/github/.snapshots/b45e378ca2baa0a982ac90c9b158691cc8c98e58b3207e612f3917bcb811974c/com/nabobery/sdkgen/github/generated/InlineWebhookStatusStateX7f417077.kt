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
 * The new state. Can be `pending`, `success`, `failure`, or `error`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/state
 */
@Serializable(with = InlineWebhookStatusStateX7f417077.Serializer::class)
public sealed class InlineWebhookStatusStateX7f417077 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookStatusStateX7f417077() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookStatusStateX7f417077() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookStatusStateX7f417077() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineWebhookStatusStateX7f417077() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookStatusStateX7f417077()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookStatusStateX7f417077 = when (value) {
      Pending.value -> Pending
      Success.value -> Success
      Failure.value -> Failure
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookStatusStateX7f417077> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookStatusStateX7f417077", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookStatusStateX7f417077 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusStateX7f417077) {
      encoder.encodeString(value.value)
    }
  }
}
