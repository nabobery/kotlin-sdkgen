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
 * The default repository access level for Dependabot updates.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1dependabot~1repository-access~1default-level/put/req
 * uestBody/content/application~1json/schema/properties/default_level
 */
@Serializable(with = InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead.Serializer::class)
public sealed class InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead = when (value) {
      Public.value -> Public
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead) {
      encoder.encodeString(value.value)
    }
  }
}
