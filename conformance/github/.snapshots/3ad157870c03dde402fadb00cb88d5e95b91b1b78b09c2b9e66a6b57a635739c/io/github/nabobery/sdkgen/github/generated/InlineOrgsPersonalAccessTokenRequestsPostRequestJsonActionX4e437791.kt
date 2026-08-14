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
 * Action to apply to the requests.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-token-requests/post/requestBody/content/applicatio
 * n~1json/schema/properties/action
 */
@Serializable(with = InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791.Serializer::class)
public sealed class InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approve`.
   */
  public data object Approve : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791() {
    public override val `value`: String = "approve"
  }

  /**
   * Documented value. Wire value: `deny`.
   */
  public data object Deny : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791() {
    public override val `value`: String = "deny"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791 = when (value) {
      Approve.value -> Approve
      Deny.value -> Deny
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokenRequestsPostRequestJsonActionX4e437791) {
      encoder.encodeString(value.value)
    }
  }
}
