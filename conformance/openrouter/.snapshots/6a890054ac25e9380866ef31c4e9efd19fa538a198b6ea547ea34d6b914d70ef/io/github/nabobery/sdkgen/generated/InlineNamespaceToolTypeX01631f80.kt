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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/NamespaceTool/properties/type
 */
@Serializable(with = InlineNamespaceToolTypeX01631f80.Serializer::class)
public sealed class InlineNamespaceToolTypeX01631f80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `namespace`.
   */
  public data object Namespace : InlineNamespaceToolTypeX01631f80() {
    public override val `value`: String = "namespace"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNamespaceToolTypeX01631f80()

  public companion object {
    public fun fromValue(`value`: String): InlineNamespaceToolTypeX01631f80 = when (value) {
      Namespace.value -> Namespace
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNamespaceToolTypeX01631f80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineNamespaceToolTypeX01631f80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNamespaceToolTypeX01631f80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNamespaceToolTypeX01631f80) {
      encoder.encodeString(value.value)
    }
  }
}
