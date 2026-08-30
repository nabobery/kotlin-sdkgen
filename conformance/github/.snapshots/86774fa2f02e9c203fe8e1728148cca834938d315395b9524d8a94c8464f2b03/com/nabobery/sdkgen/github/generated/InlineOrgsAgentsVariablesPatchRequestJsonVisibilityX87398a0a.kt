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
 * The type of repositories in the organization that can access the variable. `selected` means only the repositories
 * specified by `selected_repository_ids` can access the variable.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1agents~1variables~1{name}/patch/requestBody/content/application~1j
 * son/schema/properties/visibility
 */
@Serializable(with = InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a.Serializer::class)
public sealed class InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAgentsVariablesPatchRequestJsonVisibilityX87398a0a) {
      encoder.encodeString(value.value)
    }
  }
}
