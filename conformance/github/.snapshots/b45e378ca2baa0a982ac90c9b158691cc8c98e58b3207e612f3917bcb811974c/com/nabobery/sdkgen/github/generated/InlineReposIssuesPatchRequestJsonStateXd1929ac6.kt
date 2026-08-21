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
 * The open or closed state of the issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/state
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonStateXd1929ac6.Serializer::class)
public sealed class InlineReposIssuesPatchRequestJsonStateXd1929ac6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineReposIssuesPatchRequestJsonStateXd1929ac6() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposIssuesPatchRequestJsonStateXd1929ac6() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesPatchRequestJsonStateXd1929ac6()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesPatchRequestJsonStateXd1929ac6 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonStateXd1929ac6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesPatchRequestJsonStateXd1929ac6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonStateXd1929ac6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonStateXd1929ac6) {
      encoder.encodeString(value.value)
    }
  }
}
