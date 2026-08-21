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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/get/parameters/2/schema
 */
@Serializable(with = InlineOrgsReposGetParameterX648cede4.Serializer::class)
public sealed class InlineOrgsReposGetParameterX648cede4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsReposGetParameterX648cede4() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineOrgsReposGetParameterX648cede4() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `pushed`.
   */
  public data object Pushed : InlineOrgsReposGetParameterX648cede4() {
    public override val `value`: String = "pushed"
  }

  /**
   * Documented value. Wire value: `full_name`.
   */
  public data object FullName : InlineOrgsReposGetParameterX648cede4() {
    public override val `value`: String = "full_name"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposGetParameterX648cede4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposGetParameterX648cede4 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Pushed.value -> Pushed
      FullName.value -> FullName
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposGetParameterX648cede4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposGetParameterX648cede4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposGetParameterX648cede4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposGetParameterX648cede4) {
      encoder.encodeString(value.value)
    }
  }
}
