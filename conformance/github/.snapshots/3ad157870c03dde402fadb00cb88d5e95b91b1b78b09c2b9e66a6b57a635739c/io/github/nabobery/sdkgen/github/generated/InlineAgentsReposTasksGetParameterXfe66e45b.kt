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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/parameters/4/schema
 */
@Serializable(with = InlineAgentsReposTasksGetParameterXfe66e45b.Serializer::class)
public sealed class InlineAgentsReposTasksGetParameterXfe66e45b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated_at`.
   */
  public data object UpdatedAt : InlineAgentsReposTasksGetParameterXfe66e45b() {
    public override val `value`: String = "updated_at"
  }

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : InlineAgentsReposTasksGetParameterXfe66e45b() {
    public override val `value`: String = "created_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetParameterXfe66e45b()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetParameterXfe66e45b = when (value) {
      UpdatedAt.value -> UpdatedAt
      CreatedAt.value -> CreatedAt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetParameterXfe66e45b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetParameterXfe66e45b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetParameterXfe66e45b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetParameterXfe66e45b) {
      encoder.encodeString(value.value)
    }
  }
}
