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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/3/schema
 */
@Serializable(with = InlineUserReposGetParameterXfc9febd9.Serializer::class)
public sealed class InlineUserReposGetParameterXfc9febd9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineUserReposGetParameterXfc9febd9() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineUserReposGetParameterXfc9febd9() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `pushed`.
   */
  public data object Pushed : InlineUserReposGetParameterXfc9febd9() {
    public override val `value`: String = "pushed"
  }

  /**
   * Documented value. Wire value: `full_name`.
   */
  public data object FullName : InlineUserReposGetParameterXfc9febd9() {
    public override val `value`: String = "full_name"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposGetParameterXfc9febd9()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposGetParameterXfc9febd9 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Pushed.value -> Pushed
      FullName.value -> FullName
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserReposGetParameterXfc9febd9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposGetParameterXfc9febd9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposGetParameterXfc9febd9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposGetParameterXfc9febd9) {
      encoder.encodeString(value.value)
    }
  }
}
