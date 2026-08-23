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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1codespaces~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb.Serializer::class)
public sealed class InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodespacesSecretsPutRequestJsonVisibilityXcb4ecceb) {
      encoder.encodeString(value.value)
    }
  }
}
