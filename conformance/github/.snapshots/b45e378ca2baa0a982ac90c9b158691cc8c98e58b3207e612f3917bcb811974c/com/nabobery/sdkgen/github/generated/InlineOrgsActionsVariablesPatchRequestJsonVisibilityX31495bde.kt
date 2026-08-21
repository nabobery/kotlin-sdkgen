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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables~1{name}/patch/requestBody/content/application~1
 * json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde.Serializer::class)
public sealed class InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesPatchRequestJsonVisibilityX31495bde) {
      encoder.encodeString(value.value)
    }
  }
}
