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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/get/responses/200/content/application~1json/schema/prop
 * erties/object
 */
@Serializable(with = InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc.Serializer::class)
public sealed class InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsGetResponse200JsonObjectValueX7e3dc9bc) {
      encoder.encodeString(value.value)
    }
  }
}
