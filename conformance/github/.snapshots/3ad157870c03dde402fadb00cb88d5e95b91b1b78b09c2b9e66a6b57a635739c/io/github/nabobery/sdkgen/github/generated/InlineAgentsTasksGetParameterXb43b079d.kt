package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/parameters/3/schema
 */
@Serializable(with = InlineAgentsTasksGetParameterXb43b079d.Serializer::class)
public sealed class InlineAgentsTasksGetParameterXb43b079d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineAgentsTasksGetParameterXb43b079d() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineAgentsTasksGetParameterXb43b079d() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetParameterXb43b079d()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetParameterXb43b079d = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetParameterXb43b079d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsTasksGetParameterXb43b079d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetParameterXb43b079d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetParameterXb43b079d) {
      encoder.encodeString(value.value)
    }
  }
}
