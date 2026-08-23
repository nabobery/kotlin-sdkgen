package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/offline/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/offline/anyOf/1
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe.Serializer::class)
public sealed class InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormOfflineAnyOf2Xaa3941fe) {
      encoder.encodeString(value.value)
    }
  }
}
