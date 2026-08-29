package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The compression engine to use. Defaults to "middle-out".
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContextCompressionEngine
 */
@Serializable(with = ContextCompressionEngine.Serializer::class)
public sealed class ContextCompressionEngine {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `middle-out`.
   */
  public data object MiddleOut : ContextCompressionEngine() {
    public override val `value`: String = "middle-out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ContextCompressionEngine()

  public companion object {
    public fun fromValue(`value`: String): ContextCompressionEngine = when (value) {
      MiddleOut.value -> MiddleOut
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ContextCompressionEngine> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ContextCompressionEngine", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ContextCompressionEngine = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ContextCompressionEngine) {
      encoder.encodeString(value.value)
    }
  }
}
