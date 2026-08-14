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
 * Which type of organization repositories have access to the organization secret. `selected` means only the
 * repositories specified by `selected_repository_ids` can access the secret.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1secrets~1{secret_name}/put/requestBody/content/application
 * ~1json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a.Serializer::class)
public sealed class InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsSecretsPutRequestJsonVisibilityX3f07378a) {
      encoder.encodeString(value.value)
    }
  }
}
