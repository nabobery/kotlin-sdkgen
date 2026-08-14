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
 * Which type of organization repositories have access to the private registry. `selected` means only the repositories
 * specified by `selected_repository_ids` can access the private registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/post/requestBody/content/application~1json/sche
 * ma/properties/visibility
 */
@Serializable(with = InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47.Serializer::class)
public sealed class InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47 = when (value) {
      All.value -> All
      Private.value -> Private
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47) {
      encoder.encodeString(value.value)
    }
  }
}
