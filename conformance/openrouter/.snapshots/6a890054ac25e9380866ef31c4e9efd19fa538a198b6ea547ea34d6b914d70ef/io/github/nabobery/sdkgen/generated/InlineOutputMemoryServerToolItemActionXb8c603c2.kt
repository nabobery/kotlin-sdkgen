package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem/properties/action
 */
@Serializable(with = InlineOutputMemoryServerToolItemActionXb8c603c2.Serializer::class)
public sealed class InlineOutputMemoryServerToolItemActionXb8c603c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineOutputMemoryServerToolItemActionXb8c603c2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineOutputMemoryServerToolItemActionXb8c603c2() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineOutputMemoryServerToolItemActionXb8c603c2() {
    public override val `value`: String = "delete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMemoryServerToolItemActionXb8c603c2()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMemoryServerToolItemActionXb8c603c2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Delete.value -> Delete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMemoryServerToolItemActionXb8c603c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputMemoryServerToolItemActionXb8c603c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMemoryServerToolItemActionXb8c603c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMemoryServerToolItemActionXb8c603c2) {
      encoder.encodeString(value.value)
    }
  }
}
