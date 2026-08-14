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
 * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
 * * `off-topic`
 * * `too heated`
 * * `resolved`
 * * `spam`
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1lock/put/requestBody/content/ap
 * plication~1json/schema/properties/lock_reason
 */
@Serializable(with = InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e.Serializer::class)
public sealed class InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off-topic`.
   */
  public data object OffTopic : InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e() {
    public override val `value`: String = "off-topic"
  }

  /**
   * Documented value. Wire value: `too heated`.
   */
  public data object TooHeated : InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e() {
    public override val `value`: String = "too heated"
  }

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e() {
    public override val `value`: String = "resolved"
  }

  /**
   * Documented value. Wire value: `spam`.
   */
  public data object Spam : InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e() {
    public override val `value`: String = "spam"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e = when (value) {
      OffTopic.value -> OffTopic
      TooHeated.value -> TooHeated
      Resolved.value -> Resolved
      Spam.value -> Spam
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesLockPutRequestJsonLockReasonX3b4d7e5e) {
      encoder.encodeString(value.value)
    }
  }
}
