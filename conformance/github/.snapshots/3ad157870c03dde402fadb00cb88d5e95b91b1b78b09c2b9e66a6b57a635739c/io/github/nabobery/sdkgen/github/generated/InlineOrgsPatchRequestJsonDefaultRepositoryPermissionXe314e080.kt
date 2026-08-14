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
 * Default permission level members have for organization repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/requestBody/content/application~1json/schema/properties/defau
 * lt_repository_permission
 */
@Serializable(with = InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080.Serializer::class)
public sealed class InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080) {
      encoder.encodeString(value.value)
    }
  }
}
