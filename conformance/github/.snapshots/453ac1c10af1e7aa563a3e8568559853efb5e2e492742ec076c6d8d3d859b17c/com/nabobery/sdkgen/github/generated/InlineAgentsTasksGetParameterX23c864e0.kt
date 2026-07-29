package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/parameters/2/schema
 */
@Serializable(with = InlineAgentsTasksGetParameterX23c864e0.Serializer::class)
public sealed class InlineAgentsTasksGetParameterX23c864e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated_at`.
   */
  public data object UpdatedAt : InlineAgentsTasksGetParameterX23c864e0() {
    public override val `value`: String = "updated_at"
  }

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : InlineAgentsTasksGetParameterX23c864e0() {
    public override val `value`: String = "created_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetParameterX23c864e0()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetParameterX23c864e0 = when (value) {
      UpdatedAt.value -> UpdatedAt
      CreatedAt.value -> CreatedAt
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetParameterX23c864e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetParameterX23c864e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetParameterX23c864e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetParameterX23c864e0) {
      encoder.encodeString(value.value)
    }
  }
}
