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
 * Allowed values that can be passed to the exclude param.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations/get/parameters/3/schema/items
 */
@Serializable(with = InlineOrgsMigrationsGetParameterItemX712e3bb0.Serializer::class)
public sealed class InlineOrgsMigrationsGetParameterItemX712e3bb0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repositories`.
   */
  public data object Repositories : InlineOrgsMigrationsGetParameterItemX712e3bb0() {
    public override val `value`: String = "repositories"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMigrationsGetParameterItemX712e3bb0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMigrationsGetParameterItemX712e3bb0 = when (value) {
      Repositories.value -> Repositories
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsMigrationsGetParameterItemX712e3bb0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsMigrationsGetParameterItemX712e3bb0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMigrationsGetParameterItemX712e3bb0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMigrationsGetParameterItemX712e3bb0) {
      encoder.encodeString(value.value)
    }
  }
}
