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
 * Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out`
 * means large files will be removed during the import.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import~1lfs/patch/requestBody/content/application~1json
 * /schema/properties/use_lfs
 */
@Serializable(with = InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e.Serializer::class)
public sealed class InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opt_in`.
   */
  public data object OptIn : InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e() {
    public override val `value`: String = "opt_in"
  }

  /**
   * Documented value. Wire value: `opt_out`.
   */
  public data object OptOut : InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e() {
    public override val `value`: String = "opt_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e()

  public companion object {
    public fun fromValue(`value`: String): InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e = when (value) {
      OptIn.value -> OptIn
      OptOut.value -> OptOut
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e) {
      encoder.encodeString(value.value)
    }
  }
}
