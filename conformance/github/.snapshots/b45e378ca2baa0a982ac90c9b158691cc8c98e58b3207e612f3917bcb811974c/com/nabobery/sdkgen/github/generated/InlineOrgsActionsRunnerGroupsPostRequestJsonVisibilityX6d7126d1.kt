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
 * Visibility of a runner group. You can select all repositories, select individual repositories, or limit access to
 * private repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runner-groups/post/requestBody/content/application~1json/
 * schema/properties/visibility
 */
@Serializable(with = InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1.Serializer::class)
public sealed class InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1() {
    public override val `value`: String = "selected"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1 = when (value) {
      Selected.value -> Selected
      All.value -> All
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnerGroupsPostRequestJsonVisibilityX6d7126d1) {
      encoder.encodeString(value.value)
    }
  }
}
