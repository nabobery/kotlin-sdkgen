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
 * Allowed values that can be passed to the exclude param.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1migrations~1{migration_id}/get/parameters/2/schema/items
 */
@Serializable(with = InlineOrgsMigrationsGetParameterItemX48ce57dc.Serializer::class)
public sealed class InlineOrgsMigrationsGetParameterItemX48ce57dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `repositories`.
   */
  public data object Repositories : InlineOrgsMigrationsGetParameterItemX48ce57dc() {
    public override val `value`: String = "repositories"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMigrationsGetParameterItemX48ce57dc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMigrationsGetParameterItemX48ce57dc = when (value) {
      Repositories.value -> Repositories
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsMigrationsGetParameterItemX48ce57dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsMigrationsGetParameterItemX48ce57dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMigrationsGetParameterItemX48ce57dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMigrationsGetParameterItemX48ce57dc) {
      encoder.encodeString(value.value)
    }
  }
}
