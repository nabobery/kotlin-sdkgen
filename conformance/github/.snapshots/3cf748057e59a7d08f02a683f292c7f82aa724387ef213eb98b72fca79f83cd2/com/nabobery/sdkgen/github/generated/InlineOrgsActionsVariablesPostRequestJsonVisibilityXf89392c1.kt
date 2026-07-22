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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1variables/post/requestBody/content/application~1json/sche
 * ma/properties/visibility
 */
@Serializable(with = InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1.Serializer::class)
public sealed class InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsVariablesPostRequestJsonVisibilityXf89392c1) {
      encoder.encodeString(value.value)
    }
  }
}
