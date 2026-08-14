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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role/anyOf/2
 */
@Serializable(with = InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6.Serializer::class)
public sealed class InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `developer`.
   */
  public data object Developer : InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6() {
    public override val `value`: String = "developer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6 = when (value) {
      Developer.value -> Developer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6) {
      encoder.encodeString(value.value)
    }
  }
}
