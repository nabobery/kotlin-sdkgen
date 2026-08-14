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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers/get/responses/200/content/application~1json/schema/proper
 * ties/object
 */
@Serializable(with = InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5.Serializer::class)
public sealed class InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersGetResponse200JsonObjectValueX808e1dc5) {
      encoder.encodeString(value.value)
    }
  }
}
