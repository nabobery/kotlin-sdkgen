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
 * Visibility of a runner group. You can select all repositories, select individual repositories, or all private
 * repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups~1{runner_group_id}/patch/requestBody/conten
 * t/application~1json/schema/properties/visibility
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359.Serializer::class)
public sealed class InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359 = when (value) {
      Selected.value -> Selected
      All.value -> All
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsPatchRequestJsonVisibilityX11d02359) {
      encoder.encodeString(value.value)
    }
  }
}
