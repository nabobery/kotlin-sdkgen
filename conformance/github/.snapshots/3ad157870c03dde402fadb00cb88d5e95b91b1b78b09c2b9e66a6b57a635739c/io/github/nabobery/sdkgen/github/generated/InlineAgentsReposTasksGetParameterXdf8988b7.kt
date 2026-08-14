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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/parameters/5/schema
 */
@Serializable(with = InlineAgentsReposTasksGetParameterXdf8988b7.Serializer::class)
public sealed class InlineAgentsReposTasksGetParameterXdf8988b7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineAgentsReposTasksGetParameterXdf8988b7() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineAgentsReposTasksGetParameterXdf8988b7() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetParameterXdf8988b7()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetParameterXdf8988b7 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetParameterXdf8988b7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetParameterXdf8988b7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetParameterXdf8988b7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetParameterXdf8988b7) {
      encoder.encodeString(value.value)
    }
  }
}
