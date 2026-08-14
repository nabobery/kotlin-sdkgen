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
 * Design Arena only: arena to query. Defaults to `models` when source is `design-arena`.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1benchmarks/get/parameters/2/schema
 */
@Serializable(with = InlineBenchmarksGetParameterXb2bb899c.Serializer::class)
public sealed class InlineBenchmarksGetParameterXb2bb899c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `models`.
   */
  public data object Models : InlineBenchmarksGetParameterXb2bb899c() {
    public override val `value`: String = "models"
  }

  /**
   * Documented value. Wire value: `builders`.
   */
  public data object Builders : InlineBenchmarksGetParameterXb2bb899c() {
    public override val `value`: String = "builders"
  }

  /**
   * Documented value. Wire value: `agents`.
   */
  public data object Agents : InlineBenchmarksGetParameterXb2bb899c() {
    public override val `value`: String = "agents"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBenchmarksGetParameterXb2bb899c()

  public companion object {
    public fun fromValue(`value`: String): InlineBenchmarksGetParameterXb2bb899c = when (value) {
      Models.value -> Models
      Builders.value -> Builders
      Agents.value -> Agents
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBenchmarksGetParameterXb2bb899c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBenchmarksGetParameterXb2bb899c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBenchmarksGetParameterXb2bb899c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBenchmarksGetParameterXb2bb899c) {
      encoder.encodeString(value.value)
    }
  }
}
