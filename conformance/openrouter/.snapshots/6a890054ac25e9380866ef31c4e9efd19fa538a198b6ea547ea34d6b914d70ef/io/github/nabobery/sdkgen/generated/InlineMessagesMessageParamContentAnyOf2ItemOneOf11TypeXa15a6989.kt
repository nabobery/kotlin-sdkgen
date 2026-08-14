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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/10/prope
 * rties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/10/prope
 * rties/type
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989.Serializer::class)
public sealed class InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989 = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989) {
      encoder.encodeString(value.value)
    }
  }
}
