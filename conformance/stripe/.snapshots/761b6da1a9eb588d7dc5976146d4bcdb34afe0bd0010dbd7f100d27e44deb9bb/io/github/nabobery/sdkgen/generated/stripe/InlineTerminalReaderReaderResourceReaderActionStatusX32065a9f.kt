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
 * Status of the action performed by the reader.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_reader_action/properties/status
 */
@Serializable(with = InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f = when (value) {
      Failed.value -> Failed
      InProgress.value -> InProgress
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f) {
      encoder.encodeString(value.value)
    }
  }
}
