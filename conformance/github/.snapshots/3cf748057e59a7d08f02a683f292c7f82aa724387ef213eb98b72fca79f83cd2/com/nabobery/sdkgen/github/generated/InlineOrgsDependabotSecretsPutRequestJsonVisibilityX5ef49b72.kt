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
 * Which type of organization repositories have access to the organization secret. `selected` means only the
 * repositories specified by `selected_repository_ids` can access the secret.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72.Serializer::class)
public sealed class InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotSecretsPutRequestJsonVisibilityX5ef49b72) {
      encoder.encodeString(value.value)
    }
  }
}
