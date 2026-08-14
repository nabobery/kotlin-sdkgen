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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/type
 */
@Serializable(with = InlineOutputWebSearchServerToolItemActionTypeX26658207.Serializer::class)
public sealed class InlineOutputWebSearchServerToolItemActionTypeX26658207 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search`.
   */
  public data object Search : InlineOutputWebSearchServerToolItemActionTypeX26658207() {
    public override val `value`: String = "search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputWebSearchServerToolItemActionTypeX26658207()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputWebSearchServerToolItemActionTypeX26658207 = when (value) {
      Search.value -> Search
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputWebSearchServerToolItemActionTypeX26658207> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputWebSearchServerToolItemActionTypeX26658207", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputWebSearchServerToolItemActionTypeX26658207 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputWebSearchServerToolItemActionTypeX26658207) {
      encoder.encodeString(value.value)
    }
  }
}
