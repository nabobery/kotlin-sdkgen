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
 * The default repository access level for Dependabot updates.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1repository-access~1default-level/put/requestBody/conte
 * nt/application~1json/schema/properties/default_level
 */
@Serializable(with = InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0.Serializer::class)
public sealed class InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0 = when (value) {
      Public.value -> Public
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0) {
      encoder.encodeString(value.value)
    }
  }
}
