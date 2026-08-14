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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1/properties/me
 * mory_limit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1/properties/me
 * mory_limit
 */
@Serializable(with = InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e.Serializer::class)
public sealed class InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1g`.
   */
  public data object _1g : InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e() {
    public override val `value`: String = "1g"
  }

  /**
   * Documented value. Wire value: `4g`.
   */
  public data object _4g : InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e() {
    public override val `value`: String = "4g"
  }

  /**
   * Documented value. Wire value: `16g`.
   */
  public data object _16g : InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e() {
    public override val `value`: String = "16g"
  }

  /**
   * Documented value. Wire value: `64g`.
   */
  public data object _64g : InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e() {
    public override val `value`: String = "64g"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e = when (value) {
      _1g.value -> _1g
      _4g.value -> _4g
      _16g.value -> _16g
      _64g.value -> _64g
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterServerToolContainerAnyOf2MemoryLimitXe38ea91e) {
      encoder.encodeString(value.value)
    }
  }
}
