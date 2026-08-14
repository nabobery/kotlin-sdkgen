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
 * The type of repositories in the organization that can access the variable. `selected` means only the repositories
 * specified by `selected_repository_ids` can access the variable.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables/post/requestBody/content/application~1json/schem
 * a/properties/visibility
 */
@Serializable(with = InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab.Serializer::class)
public sealed class InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsVariablesPostRequestJsonVisibilityX3a4838ab) {
      encoder.encodeString(value.value)
    }
  }
}
